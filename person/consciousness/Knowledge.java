package person.consciousness;

public class Knowledge {
	private int level;
    public Knowledge(int level) {
    	if(level > 100 || level < 0){
    		throw new RuntimeException("Student's knowledge must be betwen 0 and 100 included");
    	}
        this.level = level;
    }

    public int getKnowledge() {
    	return this.level;
    }
}
