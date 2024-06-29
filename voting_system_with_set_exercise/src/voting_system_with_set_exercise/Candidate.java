package voting_system_with_set_exercise;

class Candidate {
    String name;
    int voteCount;

    public Candidate(String name) {
        this.name = name;
        this.voteCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void incrementVoteCount() {
        voteCount++;
    }
}