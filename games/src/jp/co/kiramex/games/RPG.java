package jp.co.kiramex.games;

public class RPG {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 勇者と敵のキャラクターを生成
//		Character hero = new Character("勇者",10,5,3);
//		Character slime = new Character("スライム",5,2,2);
//		hero.attack(slime);     // 勇者 が スライム に攻撃する
//        slime.attack(hero);     // スライム が 勇者 に攻撃する
		Hero hero = new Hero("勇者", 10, 5, 3, 1);
        Enemy slime = new Enemy("スライム", 5, 2, 2, "スライム");
//        hero.attack(slime); // 勇者 が スライム に攻撃する
//        slime.attack(hero); // スライム が 勇者 に攻撃する
	}
}
