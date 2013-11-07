package com.example.fruitilicious;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;


public class MainActivity extends SherlockActivity implements OnClickListener {

	ImageButton imageButtonApple, imageButtonAvocado, imageButtonBanana,
			imageButtonGrapes, imageButtonKiwi, imageButtonOrange,
			imageButtonStrawberry, imageButtonWatermelon;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/* IMAGE BUTTONS */

		imageButtonApple = (ImageButton) findViewById(R.id.imageButtonApple);
		imageButtonAvocado = (ImageButton) findViewById(R.id.imageButtonAvocado);
		imageButtonBanana = (ImageButton) findViewById(R.id.imageButtonBanana);
		imageButtonGrapes = (ImageButton) findViewById(R.id.imageButtonGrapes);
		imageButtonKiwi = (ImageButton) findViewById(R.id.imageButtonKiwi);
		imageButtonOrange = (ImageButton) findViewById(R.id.imageButtonOrange);
		imageButtonStrawberry = (ImageButton) findViewById(R.id.imageButtonStrawberry);
		imageButtonWatermelon = (ImageButton) findViewById(R.id.imageButtonWatermelon);

		/* PLAY SOUNDS */

		final MediaPlayer appleSound = MediaPlayer.create(this, R.raw.apple);
		final MediaPlayer avocadoSound = MediaPlayer
				.create(this, R.raw.avocado);
		final MediaPlayer bananaSound = MediaPlayer.create(this, R.raw.banana);
		final MediaPlayer grapesSound = MediaPlayer.create(this, R.raw.grapes);
		final MediaPlayer kiwiSound = MediaPlayer.create(this, R.raw.kiwi);
		final MediaPlayer orangeSound = MediaPlayer.create(this, R.raw.orange);
		final MediaPlayer strawberrySound = MediaPlayer.create(this,
				R.raw.strawberry);
		final MediaPlayer watermelonSound = MediaPlayer.create(this,
				R.raw.watermelon);

		/* APPLE BUTTON */

		imageButtonApple.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				appleSound.start();
				gotoApple();

			}

		});

		/* AVOCADO BUTTON */

		imageButtonAvocado.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				avocadoSound.start(); /* PLAY SOUND */
				gotoAvocado();

			}

		});

		/* BANANA BUTTON */

		imageButtonBanana.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				bananaSound.start(); /* PLAY SOUND */
				gotoBanana();

			}

		});

		/* GRAPES BUTTON */

		imageButtonGrapes.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				grapesSound.start(); /* PLAY SOUND */
				gotoGrapes();

			}

		});

		/* KIWI BUTTON */

		imageButtonKiwi.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				kiwiSound.start(); /* PLAY SOUND */
				gotoKiwi();

			}

		});

		/* ORANGE BUTTON */

		imageButtonOrange.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				orangeSound.start(); /* PLAY SOUND */
				gotoOrange();

			}

		});

		/* STRAWBERRY BUTTON */

		imageButtonStrawberry.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				strawberrySound.start(); /* PLAY SOUND */
				gotoStrawberry();

			}

		});

		/* WATERMELON BUTTON */

		imageButtonWatermelon.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				watermelonSound.start(); /* PLAY SOUND */
				gotoWatermelon();

			}

		});

	}

	/* ACTION BAR SHERLOCK MENU BELOW */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		com.actionbarsherlock.view.MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.main, (com.actionbarsherlock.view.Menu) menu);
		return super.onCreateOptionsMenu(menu);

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:

			return (true);
		case R.id.about:
			openAbout();
			return (true);
		case R.id.feedback:
			openFeedback();
			return (true);

		}
		return (super.onOptionsItemSelected(item));
	}

	/* Method to open feedback page from options menu */
	private void openFeedback() {
		Intent intent = new Intent();
		intent.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Feedback");
		startActivity(intent);
	}

	/* Method to open about page from options menu */
	private void openAbout() {
		Intent intent = new Intent();
		intent.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.About");
		startActivity(intent);
	}

	/* Method to go to Apple activity */
	private void gotoApple() {
		Intent gotoApple = new Intent();
		gotoApple.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Apple");
		startActivity(gotoApple);
	}

	/* Method to go to Avocado activity */
	private void gotoAvocado() {
		Intent gotoAvocado = new Intent();
		gotoAvocado.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Avocado");
		startActivity(gotoAvocado);
	}

	/* Method to go to Banana activity */
	private void gotoBanana() {
		Intent gotoBanana = new Intent();
		gotoBanana.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Banana");
		startActivity(gotoBanana);
	}

	/* Method to go to Grapes activity */
	private void gotoGrapes() {
		Intent gotoGrapes = new Intent();
		gotoGrapes.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Grapes");
		startActivity(gotoGrapes);
	}

	/* Method to go to Kiwi activity */
	private void gotoKiwi() {
		Intent gotoKiwi = new Intent();
		gotoKiwi.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Kiwi");
		startActivity(gotoKiwi);
	}

	/* Method to go to Orange activity */
	private void gotoOrange() {
		Intent gotoOrange = new Intent();
		gotoOrange.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Orange");
		startActivity(gotoOrange);
	}

	/* Method to go to Strawberry activity */
	private void gotoStrawberry() {
		Intent gotoStrawberry = new Intent();
		gotoStrawberry.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Strawberry");
		startActivity(gotoStrawberry);
	}

	/* Method to go to Watermelon activity */
	private void gotoWatermelon() {
		Intent gotoWatermelon = new Intent();
		gotoWatermelon.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Watermelon");
		startActivity(gotoWatermelon);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
