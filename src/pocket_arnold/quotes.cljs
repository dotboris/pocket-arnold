(ns pocket-arnold.quotes)

(def all-quotes
  ["Put that cookie down! Now!"
   "Get to the chopper!"
   "Hey Batman, what killed the dinosaurs? The Ice Age!"
   "Hasta la vista, baby."
   "I need your clothes, your boots, and your motorcycle."
   (str "To see your enemies, see them driven before you, and to hear the "
        "lamentation of their women!")
   "Your clothes, give them to me, now!"
   "Do it!"
   "If it bleeds, we can kill it."
   "See you at the party Richter!"
   "Let off some steam, Bennett"
   "Dillon, you son of a bitch!"
   "You hit like a vegetarian!"
   "I’m back."
   "If I am not me, then who the hell am I?"
   "Tonight, hell freezes over!"
   "I'm not into politics. I'm into survival."
   "We're cool, we're badasses, blah, blah, blah."
   (str "No more complaining. No more Mr. Kimble, I have to go the bathroom. "
        "Nothing! There IS no bathroom!")
   "What the fuck did I do wrong?!"
   (str "You're a funny guy, Sully. I like you. That's why I'm going to "
        "kill you last.")
   (str "Oh, you think you're bad, huh? You're a fucking choir boy compared "
        "to me! A CHOIR BOY!")
   "Now this is the plan : Get your ass to Mars!"
   (str "I live to see you eat that contract, but I hope you leave enough "
        "room for my fist, because I'm going to ram it into your stomach and "
        "break your goddamn spine! RAAGH!")
   "I'll be back."])

(defn random-quote []
  (rand-nth all-quotes))
