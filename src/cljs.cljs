(ns cljs
  (:require [cljs.js :as c]))

(defn ^:export compile [source-string]
  (let [result (atom nil)]
    (c/compile-str
     (c/empty-state)
     source-string
     ""
     (fn [x] (reset! result  (if (:error x)
                               (:error x)
                               (:value x)))))
    @result))
