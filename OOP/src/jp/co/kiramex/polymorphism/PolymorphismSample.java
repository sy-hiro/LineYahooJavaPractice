package jp.co.kiramex.polymorphism;

public class PolymorphismSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// スーパークラス型の配列変数で領域を確保
        Anima2 [] animals = new Anima2[3];

        // Dog、Dachshund、Catのインスタンスを生成し
        // animals配列の各要素として代入
        animals[0] = new Dog();
        animals[1] = new Dachshund();
        animals[2] = new Cat();

        newBarking(animals);
    }

    public static void newBarking(Anima2[] animals) {
        for(Anima2 animal : animals) {
            animal.barking();
        }

	}

}
