(ns pocket-arnold.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defonce talking (r/atom false))

(defn arnold-face [talking]
  (let [path (if @talking "img/arnold-talking.png"
                          "img/arnold-normal.png")]
    [:img {:src path
           :on-click #(swap! talking not)}]))

(defn app-root [talking]
  [:div [arnold-face talking]])

(let [el (.getElementById js/document "app")]
  (r/render-component [app-root talking] el))
