package extend.practice;

public class Fighter extends Human {

	public Fighter(String name) {

		this.name = name;
		this.hp = 120;
		this.offensive = 20;
	}

	@Override

	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.println(name + "が斧で攻撃！" + target.name + "に" + damage + "のダメージ！！");
		target.hp -= damage;

	}

}