package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
  
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");


		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember(); // 들어간 순서대로 그대로 출력
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAllMember(); // 중간에 삭제대해도 순서 유지
	}

}
