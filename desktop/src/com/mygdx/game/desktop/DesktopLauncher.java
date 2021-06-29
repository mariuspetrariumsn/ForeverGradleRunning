package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher
    {
        public static void main ( String[] arg )
            {
                System.out.println ( "DesktopLauncher.main() called -begin" );
                Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration ();
                new Lwjgl3Application ( new MyGdxGame () , config );
                System.out.println ( "DesktopLauncher.main() called -end" );
            }
    }
