package jp.co.sample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.CalcForm;

/**
 * フォームで入力した計算式を表示するコントローラ.
 * 
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/calc")
public class CalcController {
	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/")
	public String index() {
		return "value/inputvalue";
	}

	/**
	 * 数字を受け取って出力画面に表示する.
	 * 
	 * @param form フォーム
	 * @param model モデル
	 * @return 出力画面
	 */
	@RequestMapping("/value")
	public String value(CalcForm form) {
		int num1 = Integer.parseInt(form.getNum1());
		int num2 = Integer.parseInt(form.getNum2());

		int answer = num1 * num2;

		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);
		return "value/outputvalue";

	}
	
	@RequestMapping("/value2")
	public String value2() {
		return "value/outputvalue2";
	}
}
