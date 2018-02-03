package practice;

public interface ItemTransformer<T, U> {

	U transform(T itemIn);

}
