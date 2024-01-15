package protectProxy;

public class MyServiceImpl implements MyService {
	String name = "";
	
	public MyServiceImpl(String name) {
		this.name = name;
	}
    @Override
    public void performAction() {
        System.out.println("userName is "+name);
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
}
