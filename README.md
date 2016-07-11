Pocket Arnold
=============

A web app with a picture of Arnold Schwarzenegger. When you click on the
picture, Arnold yells movie quotes at you.

Why
---

Everybody loves Arnold!

Actually, I needed a stupid little ClojureScript project to play with during a
presentation.

Development
-----------

To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL.

Release
-------

1. Build the the release code

    ```sh
    $ bin/build-release
    ```

1. Install and configure the AWS cli
1. Deploy to S3

    ```sh
    $ bin/deploy
    ```
