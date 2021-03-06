(ns pocket-arnold.core
  (:require [reagent.core :as r]
            [pocket-arnold.quotes :as q]))

(enable-console-print!)

(defonce show-tip (r/atom true))
(defonce talking (r/atom false))
(defonce quote (r/atom nil))

(defn toggle-arnold! [talking quote shpw-tip]
  (reset! show-tip false)
  (swap! talking not)
  (when @talking
        (reset! quote (q/random-quote))))

(defn text-bubble [talking quote]
  [:div.bubble-ctn
    [:div.bubble
      {:class (when-not @talking "hidden")}
      @quote]])

(defn arnold-face [talking quote show-tip]
  (let [path (if @talking
                 "img/arnold-talking.png"
                 "img/arnold-normal.png")
        alt (if @talking
                "Arnold is talking"
                "Arnold is not talking")]
    [:div.face-ctn>img.face
      {:src path
       :alt alt
       :on-click #(toggle-arnold! talking quote show-tip)}]))

(defn app-root [talking quote show-tip]
  [:div.arnold
    [text-bubble talking quote]
    [arnold-face talking quote show-tip]
    (when @show-tip
          [:div.tip "TIP: Click on Arnold"])])

(let [el (.getElementById js/document "app")]
  (r/render-component [app-root talking quote show-tip] el))
