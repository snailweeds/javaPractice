package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList ���� 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //����� ������ ArrayList ����
	}
	
	public void addMember(Member member){  //ArrayList �� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){  // ��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");  //for �� ������ ���� return �� �ȵȰ��
		return false;                   
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}
