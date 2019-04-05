# issue-case
- ### mybatis case

mybatis在使用collection、association关联查询时，对结果集进行去重处理时，会忽略nested map，造成查询数据不完整。
```sql
==>  Preparing: SELECT g.gorderId, g.userId, g.amount, o.orderId, o.amount FROM gorder as g JOIN `order` as o ON g.gorderId = o.gorderId WHERE g.userId = ? 

==>  Parameters: rookiefly@163.com(String)

<==  Columns: GORDERID, USERID, AMOUNT, ORDERID, AMOUNT

<==  Row: 1, rookiefly@163.com, 234.5, 1, 100.0

<==  Row: 1, rookiefly@163.com, 234.5, 2, 134.5
<==  Total: 2
[Gorder(gorderId=1, userId=rookiefly@163.com, amount=234.5, createTime=null, updateTime=null, order=Order(orderId=2, gorderId=1, userId=rookiefly@163.com, amount=234.5, createTime=null, updateTime=null), orderList=null)]
```
- ### dubbo case
