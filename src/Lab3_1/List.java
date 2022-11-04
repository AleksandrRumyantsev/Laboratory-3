package Lab3_1;
//Реализация одно связного списка

    public  class List{
        private LinkList head;
        public List() {
            head = null;
        }

        public void addFirstValue(String value){ //добавление значения в начало списка!

            LinkList temp = head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            LinkList temp2 = new LinkList(value);
            temp.next = temp2;
        }
        public String getFirstValue(){  //извлечение значения из начала списка без его удаления из списка!
            LinkList temp = head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            return (temp.value);
        }
        public String getFirstValueAndDel(){  //извлечение значения из начала списка с удалением из списка!
            LinkList temp = head;
            LinkList temp2 = head;
            String res;
            while (temp.next!=null) {
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            res = temp.value;
            return (res);
        }
        public  String getLastValue(){  //извлечение значения из конца списка без его удаления!
            LinkList temp = head;
            return temp.value;
        }
        public  String getLastValueAndDel(){  //извлечение значения из конца списка с удалением!
            LinkList temp = head;
            String res = temp.value;
            temp = temp.next;
            head = temp;
            return res;
        }

        //Проверка пустой список или нет!
        private boolean isEmpty(){
            return head==null;
        }

        public void addLastValue(String value){     //добавление значения в конец списка!
            LinkList temp = new LinkList(value);
            temp.next = head;
            head = temp;
        }
        public void print(){   //Печать списка
            LinkList temp = head;
            while (temp!=null){
                System.out.println(temp.value);
                temp=temp.next;
            }
        }
        public boolean isContainsValue (String value){ //Проверка содержит ли список передаваемое значение...
            boolean res = false;
            LinkList temp = head;
            while (temp!=null){
                if (temp.value==value){res=true;}
                temp=temp.next;
            }
             return res;
        }
        public void findAndDel (String value){ //Найти элемент и удалить.
            LinkList temp = head;
            LinkList temp2 = head;
            while (temp!=null&&temp.value!=value) {
                temp2=temp;
                temp=temp.next;
                }
            if (temp!=null){
                if (temp==head){
                    head = head.next;
                }else {
                    temp2.next = temp.next;
                }
            }
        }
    }
