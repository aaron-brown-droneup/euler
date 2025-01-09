(ns euler.level1.problem003)



(defn is-prime [n]
  (empty? (filter #(= 0 %) (
     for [x (range 2 (- n 1))]
          (rem n x)
        )))
  )

(defn is-factor [x y]
  (= (rem x y) 0 )

  )

(defn find-prime-factors [n]
  (filter (fn[x] (is-factor n x)) (filter (fn[x] (is-prime x)) (range 2 (- n 1))))

  )


(defn euler-3 [n]
  (apply max (find-prime-factors n))
  )
