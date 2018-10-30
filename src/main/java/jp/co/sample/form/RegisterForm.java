package jp.co.sample.form;

/**
 * 商品価格用フォームクラス
 * 
 * @author momo.senda
 *
 */
public class RegisterForm {
/**商品1*/
private Integer goods1;
/**商品２*/
private Integer goods2;
/**商品3*/
private Integer goods3;
public Integer getGoods1() {
	return goods1;
}
public void setGoods1(Integer goods1) {
	this.goods1 = goods1;
}
public Integer getGoods2() {
	return goods2;
}
public void setGoods2(Integer goods2) {
	this.goods2 = goods2;
}
public Integer getGoods3() {
	return goods3;
}
public void setGoods3(Integer goods3) {
	this.goods3 = goods3;
}
@Override
public String toString() {
	return "RegisterForm [goods1=" + goods1 + ", goods2=" + goods2 + ", goods3=" + goods3 + ", getGoods1()="
			+ getGoods1() + ", getGoods2()=" + getGoods2() + ", getGoods3()=" + getGoods3() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
