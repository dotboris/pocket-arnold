(ns pocket-arnold.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defn hello []
  [:p "Hello Pocket Arnold"])

(defn app-root []
  [hello])

(let [el (.getElementById js/document "app")]
  (r/render-component [app-root] el))
