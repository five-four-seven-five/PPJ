package ppj;

public class Main {

	public class SomeClass<T> {
		protected T t;

		SomeClass(T t) {
			this.t = t;
		}

		void doSomething() {
			System.out.println(t + ": I am working");
		}

		T getT() {
			return this.t;
		}
	}
	
	public static void main(String[] args) {

		SomeClass<String> sc = new Main().new SomeClass<String>("Leszek") {
			@Override
			void doSomething() {
				System.out.println(t + ": I am sleeping");
			}
		};

		sc.doSomething();

	}


}
