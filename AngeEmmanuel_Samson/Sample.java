public class Sample
{
public static void main(String[] args)
{
    GameArena arena = new GameArena(500, 300);
    Player p = new Player(arena);

    while(true)
    {
    arena.pause();
    }
}
}
