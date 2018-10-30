package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.NameForm;

/**
 * @author momosenda
 * @param name リクエストパラメーター
 * @return 名前の表示画面
 *
 */
@Controller
@RequestMapping("/")
public class NameReceiveServlet {
	@RequestMapping("/")
	// 名前の情報を受け取る
	public String index() {
		return "inputname";
	}

	@RequestMapping("/toShow")

	public String toShow(NameForm form, Model model) {
		String name = form.getName();
		// モデルスコープに格納
		model.addAttribute("name", name);

		// フォワード
		return "outputname";
	}

}
