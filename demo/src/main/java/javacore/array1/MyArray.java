package javacore.array1;

import java.util.Random;

/**
 * @Title: MyArray
 * @Description: 【通用】数组工具：增删改查，常用方法
 * @Author: lz
 * @CreateDate: 2021/5/6 15:31
 * @Version: 1.0
 */
public class MyArray {

    private static final int DEFAULT_CAPACITY = 10; //数组的默认容量为10（默认长度）

    private int capacity; //自定义容量

    private Object[] array; //自定义数组底层构建数组。= new String[DEFAULT_CAPACITY]，先不初始化，在构造的时候再初始化

    private int size;

    public MyArray() {  //构造方法的是目的是创建对象
        super();
        capacity = DEFAULT_CAPACITY;
        array = new Object[DEFAULT_CAPACITY]; //无参默认创建的数组长度为10
    }

    public MyArray(int capacity) {
        super();
        this.capacity = capacity;
        array = new Object[capacity];
    }

    // 1.数组中添加元素
    public boolean add(Object obj){
        // 判断容量并扩容
        ensureCapacity(size + 1); //size + 1 先判断在存放下个元素前是否需要先扩容
        // 将新元素存入数组中
        array[size++] = obj;
        return true;
    }

    //扩容的判断。private。size:现在要存放的元素个数
    private void ensureCapacity(int size) {
        if(size >= capacity * 0.75){
            grow();
            System.out.println("数组长度为：" + array.length);
        }
    }

    // 真正的扩容
    private void grow() {
        //1、新数组的容量扩容1.5倍
        capacity = capacity + (capacity >> 1);
        //2、创建新数组
        Object[] newArray = new Object[capacity];
        //3、将旧数组的全部数据依次拷贝到新数据中
        for (int i = 0; i < size; i++) {   //size实际上就是真正的元素个数（有几个元素就拷贝几个元素），旧数组中后面null不用循环
            newArray[i] = array[i];
        }
        //4、将新的数组对象指向array变量
        array = newArray;
    }

    // 展示数组中已存在的元素
    public String display() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(array[i]);
            if(i != size-1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    // 2.通过指定的索引来获取这个索引处的值
    public Object get(int index) {
        rangeCheck(index); //检查是否越界
        return array[index];
    }

    // 3.根据指定索引来更新此处元素的值
    public void update(int index, String value) {
        rangeCheck(index);  //检查是否越界
        array[index] = value; //使用新值将旧值覆盖
    }

    // 4.根据索引删除元素,返回被删除的元素
    public Object remove(int index) {
        rangeCheck(index);
        Object removeObj = array[index]; //即将要删除的元素
        for (int i = index; i < size; i++) {
            array[i] = array[i+1]; //被删除元素后的元素会整体向前移动
        }
        if(index < size) {
            size--;
        }
        return removeObj;
    }

    // 5.返回数组中真实的元素个数
    public int size() {
        return size;
    }

    // 6.返回当前元素在数组第一次出现的索引
    public int indexOf(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (str.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    // 7.判断数组中是否真实的元素 true 空 false 非空
    public boolean isEmpty() {
        return size == 0;
    }

    // 8.判断此元素是否在数组中存在 true 存在 false 不存在
    public boolean contains(String value) {
        return indexOf(value) != -1;
    }

    // 9.统计此元素在数组中出现了多少次
    public int count(String value) {
        if(value == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(value.equals(array[i])) {
                count ++;
            }
        }
        return count;
    }

    // 10.随机打乱数组中的元素
    public void shuffle() {
        Random random = new Random();
        int randomIndex = random.nextInt(size);
        swap(randomIndex);
    }

    public void swap(int index) {
        for (int i = 0; i < size; i++) {
            Object temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    // 11.倒转数组元素
    public void reverse() {
        for (int left = 0, right = size -1; left < right ; left++, right--) {
            Object temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }

    //专用于判断索引是否越界,越界则抛出异常 (检查全数组的长度)
    private void rangeCheck(int index) {
        if(index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException(); //手动抛出数组索引越界异常
        }
    }
}
