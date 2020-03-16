<?PHP
$i1=$_POST['t1'];
$i2=$_POST['t2'];
$i3=$_POST['t3'];
$i4=$_POST['t4'];

$a=explode(',',$i1);
$b=explode(',',$i2);
$c=explode(',',$i3);
$d=explode(',',$i4); 
$s=0;
echo"<table border=2>";
echo"<tr><th>ITEM CODE</th><th>ITEM NAME</th><th>UNIT SOLD</th><th>RATE</th><th>TOTAL</th></tr>";
 for($i=0;$i<5;$i++)
{
echo"<tr>";
echo"<td>".$a[$i]."</td>";
echo"<td>".$b[$i]."</td>";
echo"<td>".$c[$i]."</td>";
echo"<td>".$d[$i]."</td>";
$t=$c[$i]*$d[$i];
echo"<td>".$t."</td>";
$s=$s + $t;
echo"</tr>";
} 
echo"<tr>";
echo"<th>".TOTAL."</th>";
echo"<td></td>";
echo"<td></td>";
echo"<td></td>";
echo"<td>".$s."</td>";
echo"</tr>";
echo"</table>";
?>
