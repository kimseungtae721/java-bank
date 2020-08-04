 package quiz;

import java.util.Scanner;

public class BankApplication {
      static Bank[] accountArray = new Bank[100];    //배열백개 선언
      static Scanner scanner = new Scanner(System.in);   // 스캐너 선언
   
      public static void main(String[] args) {
      boolean run = true;   //블런 변수은 참 or 거짓인데 선언하고 , 종료에서 폴스 줘서 끄기
      
      while(run){
      System.out.println("-------------");
      System.out.println("1.계좌생성 @| 2.예금@ | 3.출금@ | 4.이체 | 5. 잔액확인 | 6.삭제 | 0.종료");
      System.out.println("-------------");
      System.out.println("선택(숫자만 입력하세요) > ");
      
      
      int select = scanner.nextInt();

      switch(select) {
      case 1 : createAccount(); 
      			break; //계좌생성 
      case 2 : deposit(); 
      			break;  //예금
      case 3 : withdrawal();
      			break; //출금
      case 4 : transfer();
      			break;   //이체 
      case 5 : List(); 
      			break;//리스트 확인
      case 6 : transfer();
      			break;   //삭제
      default : System.out.println("메뉴어 없습니다 다시 선택하세요");
      			break;
      }
      
      /*        
         if(select ==1) {
            createAccount();   //계좌생성
            
         }else if(select == 2) {
        	 deposit();		   //예금
        	 
         }else if(select ==3) { 
        	 withdrawal();		//출금		
        	 
         }else if(select ==4) {
        	 transfer();	//이체
        	 
         }else if(select ==5) {
          System.out.println("잔액확인"); 
          	List();
          	
         }else if(select ==6) {
        	 delete();
        	 
         }else if(select ==0) {
            run = false;
            System.out.println("프로그램 종료");
      }

       */ 
   }
}   
      //계좌생성
      private static void createAccount() {
         System.out.println("-------");
         System.out.println("계좌생성");
         System.out.println("-------");
         System.out.print("계좌번호 :");
         String ano = scanner.next();

         System.out.print("계좌주 :");
         String owner = scanner.next();
         
         System.out.print("초기 입금액(숫자만입력하세요) :");     //이거 문자열로 바꿔서 할수 잇나 해보자
         int money = scanner.nextInt();
         
         for(int i = 0; i<accountArray.length; i++) {
            if(accountArray[i] == null) {
            accountArray[i] = new Bank(ano, owner, money);
            System.out.println("계좌 생성완료");
            break;
            }
         }
      }
      
      //리스트 생성
      private static void List() {
        System.out.println("*****계좌목록*****");
         for(int i = 0; i< accountArray.length; i++) {
            if(accountArray[i] == null) {
               break;
            }
            System.out.println("계좌번호:" + accountArray[i].getAno() + "\t 계좌주:" + accountArray[i].getOwner() + "\t 잔액:" + accountArray[i].getmoney());
            System.out.println();
         }
      }
      
      // 배열에 있는값과 ano랑 같은지 비교하는 메서드     이게 젤어려
      static Bank fineBank(String ano) {
         for(int i = 0; i<accountArray.length; i++) {
            if(accountArray[i] == null) {
            //System.out.println("없는 값입니다 확인해주세요");
               break;
            }
            if(accountArray[i].getAno().equals(ano)){         //ano 로 비교하는거
               return accountArray[i];
            }
         }
         return null;
      }
   
      
      //예금
      private static void  deposit() {
         System.out.println("******예금******");
         System.out.print("계좌번호 : ");
         String ano = scanner.next();
         System.out.print("입금액 :");
         int nice = scanner.nextInt();
         
         if(fineBank(ano) == null) {
            System.out.println("입력한 계좌는 없는계좌입니다");
         }else {
            fineBank(ano).setmoney(fineBank(ano).getmoney() + nice);
            System.out.println(nice + "원 입금 성공");
         }
      }
      
      private static void withdrawal() {
         System.out.println("****출금*****");
         System.out.print("계좌번호 : ");
         String ano = scanner.next();
         System.out.println("출금액 : ");
         int bad = scanner.nextInt();
         
         if(fineBank(ano) == null) {
            System.out.println("입력한 계좌는 없는계좌입니다");
         }   else if(bad > fineBank(ano).getmoney()) {         //이게왜 이렇게  비교되지 다시
            System.out.println("잔액보다 큰액수를 입력하셨습니다");
         }   else{
            fineBank(ano).setmoney(fineBank(ano).getmoney() - bad);
            System.out.println("출금이 성공했습니다");
         }
      }
    
      
      private static void transfer() {
    	  String bad;
    	  System.out.println("****이체*****");
    	  System.out.println("이체받을 계좌를 입력하세요");
    	  System.out.print("계좌번호 : ");
    	  String ano = scanner.next();
    	 // 	if(fineBank(ano) ==null) {
    	//	  System.out.println("입력한 계좌는 없는 계좌입니다");
    	//	}else {
    			  System.out.println("출금할 계좌를 입력하세요");
    			  System.out.print("계좌번호 : ");
    	    	  bad = scanner.next();  
    		//  }
    	    if(fineBank(bad) ==null) {
    	    	 System.out.println("입력한 계좌는 없는 계좌입니다");
    	    	}else {	
    		  System.out.println("이체할 금액을 입력하세요(숫자만입력하세요)");
	    	  int good = scanner.nextInt();
	    	  fineBank(ano).setmoney(fineBank(ano).getmoney() + good);
	    	  fineBank(bad).setmoney(fineBank(bad).getmoney() - good);
	   }
      }
}    
 /*
     	    private  static void delete(){
    	           System.out.println("****계좌삭제*****");
    	           System.out.println("삭제하실 계좌를 입력하세요");
    	           System.out.print("계좌번호 : ");
    	           String ano = scanner.next();
    	           
    	           if(fineBank(ano) == null){
    	              System.out.println("입력한 계좌는 없는 계좌입니다");
    	           }else {
    	        fineBank(ano).setAno(null);
    	        fineBank(ano).setOwner(null);
    	        fineBank(ano).setmoney(0);    	        	   
      */