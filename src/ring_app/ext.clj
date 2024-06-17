(ns ring-app.ext
  (:require [ring-app.core :as-alias c]))

(defn I-dont-do-too-much
  [x]
  #::c{:foo x})

(defn I-dont-do-too-much-but-I-doitwell
  [x]
  #:ring-app.core{:foo x})
