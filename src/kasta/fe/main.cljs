(ns kasta.fe.main
  (:require [rum.core :as rum]))


(rum/defc Root []
  [:div "TODO (clientttt)"])


(defn ^:export trigger-render []
  (rum/mount (Root) (js/document.getElementById "content")))
