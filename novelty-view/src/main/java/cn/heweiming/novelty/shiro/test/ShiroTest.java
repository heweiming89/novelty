package cn.heweiming.novelty.shiro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public class ShiroTest {

	public void test() {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		session.setAttribute("someKey", "aValue");

	}
	// } catch (IncorrectCredentialsException e) {
	// msg = "登录密码错误. Password for account " + token.getPrincipal() + " was
	// incorrect.";
	// model.addAttribute("message", msg);
	// System.out.println(msg);
	// } catch (ExcessiveAttemptsException e) {
	// msg = "登录失败次数过多";
	// model.addAttribute("message", msg);
	// System.out.println(msg);
	// } catch (LockedAccountException e) {
	// msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was
	// locked.";
	// model.addAttribute("message", msg);
	// System.out.println(msg);
	// } catch (DisabledAccountException e) {
	// msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was
	// disabled.";
	// model.addAttribute("message", msg);
	// System.out.println(msg);
	// } catch (ExpiredCredentialsException e) {
	// msg = "帐号已过期. the account for username " + token.getPrincipal() + " was
	// expired.";
	// model.addAttribute("message", msg);
	// System.out.println(msg);
	// } catch (UnknownAccountException e) {
	// msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
	// model.addAttribute("message", msg);
	// System.out.println(msg);
	// } catch (UnauthorizedException e) {
	// msg = "您没有得到相应的授权！" + e.getMessage();
	// model.addAttribute("message", msg);
	// System.out.println(msg);
	// }

}
