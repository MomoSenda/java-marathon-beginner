package jp.co.sample.form;

/**
 * 掛け算用フォームクラス.
 * 
 * @author momo.senda
 *
 */
public class CalcForm {
	/**かける数*/
	private String num1;
	/**かけられる数*/
	private String num2;
	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "CalcForm [num1=" + num1 + ", num2=" + num2 + ", getNum1()=" + getNum1() + ", getNum2()=" + getNum2()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
