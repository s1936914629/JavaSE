package It_04;

public class Teacher {
	public void checkScore(int score) throws ScoreException{
		if(score<0 || score>100){
			// throw new ScoreException();
			throw new ScoreException("输入成绩错误");
		}else {
			System.out.println("成绩正常");
		}
	}
	
	
}
