(ns prime-factors.core)

(def ^:private factor?
  (comp zero? rem))

(defn factorize [number]
  (loop [number number prime 2 factors []]
    (cond 
      (= number 1) factors
      (factor? number prime) (recur (/ number prime) prime (conj factors prime))
      :else (recur number (inc prime) factors))))