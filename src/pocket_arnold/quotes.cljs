(ns pocket-arnold.quotes)

(def all-quotes
  ["Put that cookie down! Now!"
   "Get to the choppa!"
   "Hey Batman, what killed the dinosaurs? The Ice Age!"
   "Hasta la vista, baby."
   "I need your clothes, your boots, and your motorcycle."
   (str "To see your enemies, see them driven before you, and to hear the "
        "lamentation of their women!")
   "I'll be back."])

(defn random-quote []
  (rand-nth all-quotes))
