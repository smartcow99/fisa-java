package step01;

class EnemySwarm {
	static int hp = 100;
	
	void Damage(int damage) {
		hp -= damage;
	}
	
	int GetHp() {
		return hp;
	}
}

class Enemy {
	int hp;
}

class Player {
	int power = 10;
	int magic = 20;
	
	public void Punch(EnemySwarm enemySwarm ) {
		enemySwarm.Damage(power); 
	}
	
	public void CastFire(EnemySwarm enemySwarm ) {
		enemySwarm.Damage(magic); 
	}
}

public class CodeReview {
	public static void main(String[] args) {
		//적 생성
		EnemySwarm enemySwarm1 = new EnemySwarm();
		EnemySwarm enemySwarm2 = new EnemySwarm();
		EnemySwarm enemySwarm3 = new EnemySwarm();
		
		//플레이어 생성
		Player player = new Player();
		
		//플레이어 공격1
		player.Punch(enemySwarm1);
		
		//플레이어 공격2
		player.CastFire(enemySwarm2);
		player.CastFire(enemySwarm3);
		
		//출력
		System.out.println(enemySwarm1.GetHp());
		System.out.println(enemySwarm2.GetHp());
		System.out.println(enemySwarm3.GetHp());
	}
}