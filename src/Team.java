public class Team {

    private League league;
    private int position;
    private String name;
    private int[] playData = new int[8]; //an array of playing data (played, wins, draws, losses, GF, GA, GD, Points)
    public Team(League league, int position, String name, int[] playData) {
        this.league = league;
        this.position = position;
        this.name = name;
        this.playData = playData;
    }
}
