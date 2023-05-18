(defproject cljs-compiler-compiler "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.60"]]
  :plugins [[lein-cljsbuild "1.1.8"]]
  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "js/cljs.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}

  :repl-options {:init-ns cljs-compiler-compiler.core})
