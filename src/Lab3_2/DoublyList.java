package Lab3_2;

public  class DoublyList{
	private Node head;
	private Node tail;

        public DoublyList() {
            head = null;
			tail = null;
        }

	private boolean isEmpty(){ //определение, является ли список пустым, или нет!
		return head==null;
	}

	public void addLastValue(int value){ //добавление значения в начало списка!
			Node temp = new Node(value);
			if (isEmpty()){
				head=temp;
			}else {
				tail.next = temp;
			}
				temp.prev = tail;
				tail = temp;
		}
	public void addFirstValue(int value){ //добавление значения в конец списка!
			Node temp = new Node(value);
			if(isEmpty()){
				tail= temp;
			}else{
				head.prev = temp;
			}
				temp.next = head;
				head = temp;
		}
	public int getFirstValue(){ //извлечение значения из начала списка без его удаления из списка!
				return head.value;
			}
	public  int getLastValue(){ //извлечение значения из конца списка без его удаления!
				return tail.value;
			}
	public int getFirstValueAndDel(){ //извлечение значения из начала списка с удалением из списка!
			if (isEmpty()){throw new NullPointerException ();}
			int res = head.value;
			if (head.next==null){
				head=null;
			}else{
				head = head.next;
				head.prev = null;
			}
			return (res);
		}
	public  int getLastValueAndDel() { //извлечение значения из конца списка с удалением!
		if (isEmpty()) {
			throw new NullPointerException();
		}
		int res;
		if (head.next == null) {
			res = head.value;
			head = null;
		} else {
			res = tail.value;
			tail=tail.prev;
			tail.next=null;
		}
            return res;
        }

	public void print(){ //печать всех значений списка!
		Node temp = head;
		while (temp!=null){
			System.out.print(temp.value+",");
			temp=temp.next;
		}
		System.out.print("\n");
	}
	public void printRevers(){ //печать всех значений списка в обратном порядке!
		Node temp = tail;
		while (temp!=null){
			System.out.print(temp.value+",");
			temp=temp.prev;
		}
		System.out.print("\n");
	}
	public boolean isContainsValue (int value){ //Проверка содержит ли список передаваемое значение...
		if (isEmpty()){
			throw new NullPointerException();
		}
		Node temp = head;
		while (temp!=null){
			if (temp.value==value){return true;}
			temp=temp.next;
		}
		return false;
	}
	public void findAndDel (int value){ //Найти элемент и удалить.
		if (isEmpty()){
			throw new NullPointerException();
		}
			Node temp = head;
			Node temp2 = head;
		while (temp!=null) {
			if (temp.value== value){
				if (temp==head){
					head = temp.next;
				}else{
					temp2 = temp.prev;
					temp2.next = temp.next;
				}
			}
			temp=temp.next;
		}
	}
	public void insertByIndex(int index, int value){
		if (isEmpty()){
			throw new NullPointerException();
		}
		Node temp = head;
		Node newNode = new Node(value);
		int count=0;
		while (temp!=null){
				if (count==index){
					if(temp==head){
						addFirstValue(value);
						return;
					}else{
						if (temp!=tail) {
							newNode.next = temp;
							newNode.prev = temp.prev;
							temp.prev.next = newNode;
							temp.prev = newNode;
							return;
						}else{
							addLastValue(value);
							return;
						}
					}
				}
				temp=temp.next;
				count++;
			}
			throw new IllegalArgumentException("Неверно задано значение индекса");
	}
	public void addArrBeforeList(int [] values){  // добавление всех значений заданного массива в начало списка
		for (int i = values.length-1; i>=0;i--){
			addFirstValue(values[i]);
		}
	}
	public void addCollectionBeforeList (Iterable<Integer> values){  //добавление всех значений заданной коллекции в начало списка с сохранением порядка
		int count = 0;
		for (Integer val:values){
			insertByIndex(count,val);
			count++;
		}
	}
	public void addArrAfterList(int [] values){  // добавление всех значений заданного массива/коллекции (два метода) в конец списка с 		сохранением порядка
		for (int i = 0; i<values.length;i++){
			addLastValue(values[i]);
		}
	}
	public void addCollectionAfterList (Iterable<Integer> values){  //добавление всех значений заданной коллекции в конец списка с сохранением порядка
		for (Integer val:values){
			addLastValue(val);
		}
	}
	public void mergeAtFirst(DoublyList list){
		Node temp = head;
		Node temp2 = list.tail;
		temp2.next = temp;
		temp.prev = temp2;
		head = list.head;
		list.head=null;
	}
	public void mergeAtLast(DoublyList list){
		Node temp = tail;
		Node temp2 = list.head;
		temp.next = temp2;
		temp2.prev = temp;
		tail = list.tail;
		list.head=null;
	}

	private   class Node {

		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {
			this.value = value;
		}
	}

    }