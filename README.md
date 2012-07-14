# play-injected-routes-example

An example of configuring routes that aren't defined in the 'routes' file.
I don't know it this is the expected way to do this.

There is a ticket for this feature - which has been resolved - but no
explanation as how one does it.

Ticket is here: https://play.lighthouseapp.com/projects/82401/tickets/12

Also stack overflow here: 
http://stackoverflow.com/questions/10116286/programatically-adding-a-route-in-play2-0

The other downside of this approach is that its configured in the app, so
a plugin/module can't contribute routes without a little bit of fiddling with
the main app.

# running
    git clone git@github.com:edeustace/play-injected-routes-example.git
    cd play-injected-routes-example
    play run
    curl http://localhost:9000/injectedRoute //returns a string
    curl http://localhost:9000/injectedRouteWithParam/2 //return 'the number is:
    2'

