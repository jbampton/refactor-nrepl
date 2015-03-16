(ns com.example.test-unbound
  (:require [clojure.string :refer [join split blank? trim]]))

(defn fn-with-unbounds []
  (when-not (blank? s)
    (-> s (split " ")
        (join sep)
        trim)))