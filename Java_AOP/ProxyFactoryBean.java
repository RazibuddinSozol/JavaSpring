package Java_AOP;

import java.util.List;

public class ProxyFactoryBean {
	private Object target;
	private List<String> interceptorNames;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public List<String> getInterceptorNames() {
		return interceptorNames;
	}

	public void setInterceptorNames(List<String> interceptorNames) {
		this.interceptorNames = interceptorNames;
	}
}