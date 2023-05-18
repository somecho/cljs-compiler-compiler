# CLJS Compiler Compiler

A compiler to compile CLJS's compiler... 

## Seriously now
After reading David Nolen write about [compiling ClojureScript in the
browser](http://swannodette.github.io/2015/07/29/clojurescript-17/), I wanted
to try it out myself. Unfortunately, the article is from 2015 and he covered the
topic only from a high level.

This project is to expose `cljs/compile-str` to be callable from JS. Inspired by
the [Klipse project](https://github.com/viebel/klipse).

## Usage
```sh
git clone https://github.com/somecho/cljs-compiler-compiler
cd cljs-compiler-compiler
lein cljsbuild once
```
There will now be a `cljs.js` file in `/js`. You can then add this as a script
to your html document. 

Alternatively, a [prebuilt JS script](./js/cljs.js) is already packaged in this repo. 

```js
cljs.compile("(+ 1 1)")
// returns '((1 + 1))\n'
```
