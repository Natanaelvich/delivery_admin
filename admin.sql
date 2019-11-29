select * from pedido ,produto  where status = 'Pendente' and produto.empresa_id = 1 ;

select u.nome,u.email,u.telefone,pe.id,pr.descricao,pe.created_at,em.nome,pe.status  from pedido pe
join produto pr
on pr.id = pe.id_produto
join empresa em
on em.id = pr.empresa_id
join usuario u
on pe.id_usuario = u.id
where pr.empresa_id = 1
and pe.status = 'Pendente';

