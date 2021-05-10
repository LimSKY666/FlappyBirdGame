package itis.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import itis.game.FlappyBird;

public class MenuState extends State {

    private Texture backGround;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        camera.setToOrtho(false,FlappyBird.WIDTH/2,FlappyBird.HEIGHT/2);
        backGround = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.draw(backGround, 0, 0);
        sb.draw(playBtn, camera.position.x-playBtn.getWidth()/2, camera.position.y);
        sb.end();
    }

    @Override
    public void dispose() {
        backGround.dispose();
        playBtn.dispose();
        System.out.println("MenuState Disposed");
    }
}
