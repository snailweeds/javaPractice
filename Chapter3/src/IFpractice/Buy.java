package IFpractice;

public interface Buy {
	void Buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
