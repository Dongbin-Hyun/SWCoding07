
public class kopo44_13 {
	
	private int kopo44_student_id;//������ �������� student_id�� private���� ����.
	private String kopo44_name;//���ڿ��� �������� name�� private���� ����.
	private int kopo44_kor;//������ �������� kor�� private���� ����.
	private int kopo44_eng;//������ �������� eng�� private���� ����.
	private int kopo44_mat;//������ �������� mat�� private���� ����.
	
	public kopo44_13(int kopo44_student_id, String kopo44_name, int kopo44_kor, int kopo44_eng, int kopo44_mat) {//������ P6classScore�� �����ϰ� �Ķ���ͷ� �������� ����.
		this.kopo44_student_id = kopo44_student_id;//this�� �̿��Ͽ� student_id�� �����ִ� �������� student_id��� ����.
		this.kopo44_name = kopo44_name;//this�� �̿��Ͽ� name�� �����ִ� �������� name�̶�� ����.
		this.kopo44_kor = kopo44_kor;//this�� �̿��Ͽ� kor�� �����ִ� �������� kor�̶�� ����.
		this.kopo44_eng = kopo44_eng;//this�� �̿��Ͽ� eng�� �����ִ� �������� eng�̶�� ����.
		this.kopo44_mat = kopo44_mat;//this�� �̿��Ͽ� mat�� �����ִ� �������� mat�̶�� ����.
	}
	public int kopo44_student_id() {return this.kopo44_student_id;}; //student_id�Լ��� �����ϰ� ���ϰ����� �������� student_id�� ��.
	public String kopo44_name() {return this.kopo44_name;}; //name�Լ��� �����ϰ� ���ϰ����� �������� name�� ��.
	public int kopo44_kor() {return this.kopo44_kor;}; //kor�Լ��� �����ϰ� this�� �̿��Ͽ� kor�� �����ִ� �������� kor�̶�� �˷��ְ� ���ϰ����� �������� kor�� ��.
	public int kopo44_eng() {return this.kopo44_eng;}; //eng�Լ��� �����ϰ� this�� �̿��Ͽ� eng�� �����ִ� �������� eng�̶�� �˷��ְ� ���ϰ����� �������� eng�� ��.
	public int kopo44_mat() {return this.kopo44_mat;}; //mat�Լ��� �����ϰ� this�� �̿��Ͽ� mat�� �����ִ� �������� mat�̶�� �˷��ְ� ���ϰ����� �������� mat�� ��.
	public int kopo44_sum() {return this.kopo44_kor + this.kopo44_eng + this.kopo44_mat;}; //sum�Լ��� �����ϰ�  this�� �̿��Ͽ� �����������̶�� �˷��ְ� 3���� ���������� ���� ���ϰ����� ��.
	public double kopo44_avg() {return this.kopo44_sum() / 3.0;}; //avg�Լ��� �����ϰ� ���ϰ����� sum�Լ��� ���ϰ� ������ 3.

}

