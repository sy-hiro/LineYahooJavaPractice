package jp.co.kiramex.company.entity;

import jp.co.kiramex.company.entity.Sales;

public class UseSales {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sales sales = new Sales(10, "南野", 200);

        // サブクラスのフィールドに値をセット
        sales.setAppointment("ほげほげ商事株式会社");

        // スーパークラスのメソッドも使えます
        sales.introduce();

        // スーパークラスのメソッドも使えます
        sales.greeting();

        // サブクラス独自のメソッドも使えます
        sales.report();

        // 体力表示
        sales.showVitality();
    }
}
