package core;
import java.util.ArrayList;
public class Stack implements IStack {
	private ArrayList<Object> elms ;
	public Stack()
	{
		elms = new ArrayList<Object>();
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		if(elms != null)
			return elms.size();
		else
			return 0;
	}
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void push(Object elm) {
		elms.add(elm);

	}
	@Override
	public Object top(Object elm) {
		// TODO Auto-generated method stub
		return elms.get(getSize()-1);
	}
}
