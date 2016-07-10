(ns pocket-arnold.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defonce talking (r/atom false))

(defn arnold-face [talking]
  (let [path (if @talking
                 "img/arnold-talking.png"
                 "img/arnold-normal.png")
        alt (if @talking
                "Arnold is talking"
                "Arnold is not talking")]
    [:div.face-ctn>img.face
      {:src path
       :alt alt
       :width 360 :heigth 500
       :on-click #(swap! talking not)}]))

(defn app-root [talking]
  [arnold-face talking])

(let [el (.getElementById js/document "app")]
  (r/render-component [app-root talking] el))
