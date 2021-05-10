package itis.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import itis.game.FlappyBird;

public class MenuState extends State {

    private Texture backGround;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        backGround = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(backGround, 0, 0, FlappyBird.WIDTH, FlappyBird.HEIGHT);
        sb.draw(playBtn, (FlappyBird.WIDTH / 2) - (playBtn.getWidth() / 2), FlappyBird.HEIGHT / 2);
        sb.end();
    }

    @Override
    public void dispose() {
        backGround.dispose();
        playBtn.dispose();

    }
}
