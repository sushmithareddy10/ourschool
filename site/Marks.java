package sush;
public class Marks {
    private int telugu;
    private int hindi;
    private int english;
    private int maths;
    private int science;
    private int social;
    public Marks()
    {
    	
    }
	public Marks(int telugu, int hindi, int english, int maths, int science, int social) {
		//super();
		this.telugu = telugu;
		this.hindi = hindi;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
	}
	public int getTelugu() {
		return telugu;
	}

	public void setTelugu(int telugu) {
		this.telugu = telugu;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}


	  public int getTotalMarks()
	  {
		int total=telugu+hindi+english+maths+science+social;
		return total;
	  }
}
