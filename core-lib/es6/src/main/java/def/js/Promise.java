package def.js;

/**
 * Represents the completion of an asynchronous operation
 */
public class Promise<T> extends def.js.Object {
    /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledFunctionOnrejectedFunction(java.util.function.Function<T,TResult> onfulfilled, java.util.function.Function<java.lang.Object,TResult> onrejected);
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledFunction(java.util.function.Function<T,TResult> onfulfilled, java.util.function.Consumer<java.lang.Object> onrejected);
    /**
     * Attaches a callback for only the rejection of the Promise.
     * @param onrejected The callback to execute when the Promise is rejected.
     * @returns A Promise for the completion of the callback.
     */
    @jsweet.lang.Name("catch")
    native public Promise<T> catchOnrejectedFunction(java.util.function.Function<java.lang.Object,T> onrejected);
    native public java.lang.String $get(Symbol toStringTag);
    /** 
      * A reference to the prototype. 
      */
    public static Promise<?> prototype;
    /**
     * Creates a new Promise.
     * @param executor A callback used to initialize the promise. This callback is passed two arguments: 
     * a resolve callback used resolve the promise with a value or the result of another promise, 
     * and a reject callback used to reject the promise with a provided reason or error.
     */
    public Promise(ExecutorBiConsumer<java.util.function.Consumer<T>,java.util.function.Consumer<java.lang.Object>> executor){}
    /**
     * Creates a Promise that is resolved with an array of results when all of the provided Promises 
     * resolve, or rejected when any Promise is rejected.
     * @param values An array of Promises.
     * @returns A new Promise.
     */
    native public static <T> Promise<T[]> all(IterableT<T> values);
    /**
     * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved 
     * or rejected.
     * @param values An array of Promises.
     * @returns A new Promise.
     */
    native public static <T> Promise<T> race(IterableT<T> values);
    /**
     * Creates a new rejected promise for the provided reason.
     * @param reason The reason the promise was rejected.
     * @returns A new rejected Promise.
     */
    native public static Promise<Void> reject(java.lang.Object reason);
    /**
      * Creates a new resolved promise for the provided value.
      * @param value A promise.
      * @returns A promise whose internal state matches the provided promise.
      */
    native public static <T> Promise<T> resolve(T value);
    /**
     * Creates a new resolved promise .
     * @returns A resolved promise.
     */
    native public static Promise<Void> resolve();
    /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledFunction(java.util.function.Function<T,TResult> onfulfilled);
    /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
    native public <TResult> Promise<TResult> then();
    /**
     * Attaches a callback for only the rejection of the Promise.
     * @param onrejected The callback to execute when the Promise is rejected.
     * @returns A Promise for the completion of the callback.
     */
    @jsweet.lang.Name("catch")
    native public Promise<T> Catch();
    /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledFunctionOnrejectedPromiseLikeFunction(java.util.function.Function<T,TResult> onfulfilled, java.util.function.Function<java.lang.Object,PromiseLike<TResult>> onrejected);
    /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledPromiseLikeFunctionOnrejectedPromiseLikeFunction(java.util.function.Function<T,PromiseLike<TResult>> onfulfilled, java.util.function.Function<java.lang.Object,PromiseLike<TResult>> onrejected);
    /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledPromiseLikeFunctionOnrejectedFunction(java.util.function.Function<T,PromiseLike<TResult>> onfulfilled, java.util.function.Function<java.lang.Object,TResult> onrejected);
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledPromiseLikeFunction(java.util.function.Function<T,PromiseLike<TResult>> onfulfilled, java.util.function.Consumer<java.lang.Object> onrejected);
    /**
     * Attaches a callback for only the rejection of the Promise.
     * @param onrejected The callback to execute when the Promise is rejected.
     * @returns A Promise for the completion of the callback.
     */
    @jsweet.lang.Name("catch")
    native public Promise<T> catchOnrejectedPromiseLikeFunction(java.util.function.Function<java.lang.Object,PromiseLike<T>> onrejected);
    /**
     * Creates a new Promise.
     * @param executor A callback used to initialize the promise. This callback is passed two arguments: 
     * a resolve callback used resolve the promise with a value or the result of another promise, 
     * and a reject callback used to reject the promise with a provided reason or error.
     */
    public Promise(ExecutorPromiseLikeBiConsumer<java.util.function.Consumer<PromiseLike<T>>,java.util.function.Consumer<java.lang.Object>> executor){}
    /**
     * Creates a Promise that is resolved with an array of results when all of the provided Promises 
     * resolve, or rejected when any Promise is rejected.
     * @param values An array of Promises.
     * @returns A new Promise.
     */
    native public static <T> Promise<T[]> all(IterablePromiseLikeT<T> values);
    /**
     * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved 
     * or rejected.
     * @param values An array of Promises.
     * @returns A new Promise.
     */
    native public static <T> Promise<T> race(IterablePromiseLikeT<T> values);
    /**
      * Creates a new resolved promise for the provided value.
      * @param value A promise.
      * @returns A promise whose internal state matches the provided promise.
      */
    native public static <T> Promise<T> resolve(PromiseLike<T> value);
    /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
    @jsweet.lang.Name("then")
    native public <TResult> Promise<TResult> thenOnfulfilledPromiseLikeFunction(java.util.function.Function<T,PromiseLike<TResult>> onfulfilled);
    protected Promise(){}
    /** This functional interface should be used for disambiguating lambdas in function parameters (by casting to this interface).<p>It was automatically generated for functions (taking lambdas) that lead to the same erased signature. */
    @java.lang.FunctionalInterface()
    @jsweet.lang.Erased
    public interface ExecutorPromiseLikeBiConsumer<T1,T2> {
        public void $apply(T1 p1, T2 p2);
    }
    /** This functional interface should be used for disambiguating lambdas in function parameters (by casting to this interface).<p>It was automatically generated for functions (taking lambdas) that lead to the same erased signature. */
    @java.lang.FunctionalInterface()
    @jsweet.lang.Erased
    public interface ExecutorBiConsumer<T1,T2> {
        public void $apply(T1 p1, T2 p2);
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class IterableT<T> extends def.js.Object {
        public IterableT(Iterable<T> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class IterablePromiseLikeT<T> extends def.js.Object {
        public IterablePromiseLikeT(Iterable<PromiseLike<T>> values){}
    }
}

