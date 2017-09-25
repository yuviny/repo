// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package finf.ucf.cu.domain;
/**
 * @see finf.ucf.cu.domain.Users
 */
public class UsersDaoImpl
    extends finf.ucf.cu.domain.UsersDaoBase
{
    /**
     * @see finf.ucf.cu.domain.UsersDao#toUserVO(finf.ucf.cu.domain.Users, finf.ucf.cu.vo.UserVO)
     */
    public void toUserVO(
        finf.ucf.cu.domain.Users source,
        finf.ucf.cu.vo.UserVO target)
    {
        // @todo verify behavior of toUserVO
        super.toUserVO(source, target);
    }


    /**
     * @see finf.ucf.cu.domain.UsersDao#toUserVO(finf.ucf.cu.domain.Users)
     */
    public finf.ucf.cu.vo.UserVO toUserVO(final finf.ucf.cu.domain.Users entity)
    {
        // @todo verify behavior of toUserVO
        return super.toUserVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private finf.ucf.cu.domain.Users loadUsersFromUserVO(finf.ucf.cu.vo.UserVO userVO)
    {
        // @todo implement loadUsersFromUserVO
        throw new java.lang.UnsupportedOperationException("finf.ucf.cu.domain.loadUsersFromUserVO(finf.ucf.cu.vo.UserVO) not yet implemented.");

        /* A typical implementation looks like this:
        finf.ucf.cu.domain.Users users = this.load(userVO.getId());
        if (users == null)
        {
            users = finf.ucf.cu.domain.Users.Factory.newInstance();
        }
        return users;
        */
    }

    
    /**
     * @see finf.ucf.cu.domain.UsersDao#userVOToEntity(finf.ucf.cu.vo.UserVO)
     */
    public finf.ucf.cu.domain.Users userVOToEntity(finf.ucf.cu.vo.UserVO userVO)
    {
        // @todo verify behavior of userVOToEntity
        finf.ucf.cu.domain.Users entity = this.loadUsersFromUserVO(userVO);
        this.userVOToEntity(userVO, entity, true);
        return entity;
    }


    /**
     * @see finf.ucf.cu.domain.UsersDao#userVOToEntity(finf.ucf.cu.vo.UserVO, finf.ucf.cu.domain.Users)
     */
    public void userVOToEntity(
        finf.ucf.cu.vo.UserVO source,
        finf.ucf.cu.domain.Users target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userVOToEntity
        super.userVOToEntity(source, target, copyIfNull);
    }

    /**
     * @see finf.ucf.cu.domain.UsersDao#toUserDetailsVO(finf.ucf.cu.domain.Users, finf.ucf.cu.vo.UserDetailsVO)
     */
    public void toUserDetailsVO(
        finf.ucf.cu.domain.Users source,
        finf.ucf.cu.vo.UserDetailsVO target)
    {
        // @todo verify behavior of toUserDetailsVO
        super.toUserDetailsVO(source, target);
        // WARNING! No conversion for target.roles (can't convert source.getRoles():finf.ucf.cu.domain.UserRole to finf.ucf.cu.vo.UserRoleVO[]
    }


    /**
     * @see finf.ucf.cu.domain.UsersDao#toUserDetailsVO(finf.ucf.cu.domain.Users)
     */
    public finf.ucf.cu.vo.UserDetailsVO toUserDetailsVO(final finf.ucf.cu.domain.Users entity)
    {
        // @todo verify behavior of toUserDetailsVO
        return super.toUserDetailsVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private finf.ucf.cu.domain.Users loadUsersFromUserDetailsVO(finf.ucf.cu.vo.UserDetailsVO userDetailsVO)
    {
        // @todo implement loadUsersFromUserDetailsVO
        throw new java.lang.UnsupportedOperationException("finf.ucf.cu.domain.loadUsersFromUserDetailsVO(finf.ucf.cu.vo.UserDetailsVO) not yet implemented.");

        /* A typical implementation looks like this:
        finf.ucf.cu.domain.Users users = this.load(userDetailsVO.getId());
        if (users == null)
        {
            users = finf.ucf.cu.domain.Users.Factory.newInstance();
        }
        return users;
        */
    }

    
    /**
     * @see finf.ucf.cu.domain.UsersDao#userDetailsVOToEntity(finf.ucf.cu.vo.UserDetailsVO)
     */
    public finf.ucf.cu.domain.Users userDetailsVOToEntity(finf.ucf.cu.vo.UserDetailsVO userDetailsVO)
    {
        // @todo verify behavior of userDetailsVOToEntity
        finf.ucf.cu.domain.Users entity = this.loadUsersFromUserDetailsVO(userDetailsVO);
        this.userDetailsVOToEntity(userDetailsVO, entity, true);
        return entity;
    }


    /**
     * @see finf.ucf.cu.domain.UsersDao#userDetailsVOToEntity(finf.ucf.cu.vo.UserDetailsVO, finf.ucf.cu.domain.Users)
     */
    public void userDetailsVOToEntity(
        finf.ucf.cu.vo.UserDetailsVO source,
        finf.ucf.cu.domain.Users target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userDetailsVOToEntity
        super.userDetailsVOToEntity(source, target, copyIfNull);
    }

}