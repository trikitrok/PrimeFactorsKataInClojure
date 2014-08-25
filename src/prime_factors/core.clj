(ns prime-factors.core)

(def ^:private factor?
  (comp zero? rem))

(defn factorize [n]
  (loop [n n prime 2 factors []]
    (cond 
      (= n 1) factors
      (factor? n prime) (recur (/ n prime) prime (conj factors prime))
      :else (recur n (inc prime) factors))))